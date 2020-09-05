class Caluculation
{
void fact(int n)
{
int i=1,f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("factorial is"+f);
}
public static void main(String args[])
{
new Caluculation().fact(5);
}
}

