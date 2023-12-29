/*Practical Use Of Truthy Or Falsy Values */

/*Using A Truthy Value*/

let height=4;

if (height) {
    console.log(`Height Is Defined ${height} ft`);
}
else {
    console.log(`Height Is Not Defined `);
}

/*Using A Falsy Value*/

let height=null;

if (height) {
    console.log(`Height Is Defined ${height} ft`);
}
else {
    console.log(`Height Is Not Defined `);
}


/*Using  0*/

let height=0;

if (height) {
    console.log(`Height Is Defined ${height} ft`);
}
else if (height == 0)
{
     console.log(`Height Is Defined ${height} ft`);
    }
else {
    console.log(`Height Is Not Defined `);
}