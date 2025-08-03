import Styles from './EmployeeCard.module.css';
function EmployeeCard(props) {
    return (
        <div className={Styles.Card}>
            <h3>{props.employee.name}</h3>
            <p>{props.employee.email}</p>
            <p>{props.employee.phone}</p>
            <p>
                <a href="#" className={props.theme}>Edit</a>&nbsp;&nbsp;
                <a href="#" className={props.theme}>Delete</a> 
            </p>
        </div>
    );
}
export default EmployeeCard;
