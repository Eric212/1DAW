#include <stdio.h>
int main()
{	int anyo;
	printf("%s","Introduce un año: ");
	scanf("%d",&anyo);
	
	if(anyo % 400 == 0){
		puts("Es bisiesto");
	}
	else{
		if(anyo % 4 == 0 && anyo % 100 != 0)
		{
		puts("Es bisiesto");
		}
		else
		{
		puts("No es bisiesto");
		}
	}
	return 0;
}
