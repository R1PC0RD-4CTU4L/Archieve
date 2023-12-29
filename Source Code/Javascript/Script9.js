/*Write A Javascript Code To Check If A Given Year Is A Leap Year Or Not */

const year = 2024;

if (year % 100 === 0)
{
    if (year % 400 === 0)
    {
        console.log(`${year} is leap year`);
    } else
    {
        console.log(`${year} is not leap year`);
        }
} else
{
    if (year % 4 === 0)
    {
        console.log(`${year} is leap year`);
    } else
    {
        console.log(`${year} is not leap year`);
        }
        
}