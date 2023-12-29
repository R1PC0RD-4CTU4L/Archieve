let weekDay = prompt('Enter The Day! e.g:- Sun,Mon,Tue,Wed,Thu,Fri,Sat');

switch (weekDay) {
    case 'Mon' || 'mon':
        console.log('Today is Monday! You Are Supposed To Study DSA!');
        break;
    
    case 'Tue' || 'tue':
        console.log('Today is Tuesday! You Are Supposed To Study Javascript!')
        break;
    
    case 'Wed' || 'wed':
        console.log('Today is Wednesday! You Are Supposed To Study Java J2EE');
        break;
    

    case 'Thu' || 'thu':
        console.log('Today is Thursday! You Are Supposed To Study PL/SQL');
        break;
    
    case 'Fri' || 'fri':
        console.log('Today is Friday! You Are Supposed To Study Linux Administration');
        break;
    
    case 'Sat' || 'sat':
        console.log('Today is Saturday! You are supposed to study System Design!');
        break;
    
    case 'Sun' || 'sun':
        console.log('Today is Sunday! You are supposed take rest!! No Study Today');
        break;
    
    default:
        console.log('You have entered an invalid entry! Try again');
}
    