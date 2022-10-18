def sum(a,b)
{
  echo "The sum of ${a} and ${b} is ${a+b}"
}
def sub(a,b)
{
  echo "The sub of ${a} and ${b} is ${a-b}"
}
def mul(a,b)
{
  echo "The mul of ${a} and ${b} is ${a*b}"
}
def div(a,b)
{
  if ${b}==0
  {
  echo "Invalid Input"
  }
  else
  {
  echo "The div of ${a} and ${b} is ${a/b}"
  } 
}
