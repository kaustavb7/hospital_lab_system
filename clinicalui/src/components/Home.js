import React from 'react'
import axios from 'axios'
import {Link} from 'react-router-dom'

class Home extends React.Component
{
    state = {
        patientData :[]
    }
    componentWillMount()
    {
axios.get('http://localhost:8080/api/patient').then(res=>{
    const patientData = res.data;
    console.log(res.data)
    this.setState({patientData})
})
    }
    render()
    {
        return(<div>
            <h2>Patient:</h2>
<table align='center'>
    <thead>
        <tr>
            <th>Id</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
        {this.state.patientData.map(patient=><RowCreator item={patient}/>)}
    </tbody>
</table>
<br/>
<Link to ={'addData/'}>Register Patient</Link>

        </div>)
    }
}


class RowCreator extends React.Component{
    render(){
        var patient = this.props.item;
        return <tr>
            <td>{patient.id}</td>
            <td>{patient.firstName}</td>
            <td>{patient.lastName}</td>
            <td>{patient.age}</td>
            <td><Link to ={'patientData/'+patient.id}>Add Data</Link></td>
            <td><Link to ={'analyzeData/'+patient.id}>Analyze</Link></td>
        </tr>
    }
}

export default  Home