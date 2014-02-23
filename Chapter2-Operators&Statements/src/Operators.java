
public class Operators {
	
	/*************赋值运算符*************/
	int nTest = 1;
	
	//错误的数据类型转换
	//short shTest = nTest;
	
	//隐式转换
	short shTest = 1;
	int nTest1 = shTest;
	
	//结合顺序，隐式转换
	int nTest2 = 1;
	double dTest = nTest2 = 3;
	
	//CompositeOperators
	public void CompositeOperators()
	{
		nTest +=1;
		nTest -=1;
		nTest *=1;
		nTest /=1;
		nTest %=1;
	}
	
	/*************算数运算符*************/
	//Unary
	int nTest3 = +1;
	int nTest4 = -1;
	
	//BinaryOperator
	public void BinaryOperator()
	{
		nTest = nTest1 + nTest2;
		nTest = nTest1 - nTest2;
		nTest = nTest1 * nTest2;
		nTest = nTest1 / nTest2;
		nTest = nTest1 % nTest2;
	}
	
	/*************自增自减运算符*************/
	
	//Increment Decrement Operators
	public void IncrementDecrement() {

		nTest3 = nTest4++;
		nTest3 = ++nTest4;
		
		nTest3 = nTest4--;
		nTest3 = --nTest4;
	}
	
	/*************关系运算符*************/
	//Relational Operators
	
	public void RelationalOperator()
	{
		//关系运算符
		System.out.print(3>4);
		System.out.print(4>3);

		System.out.print(4>=3);
		System.out.print(4<=4);
		
		System.out.print(4==3);
		System.out.print(4!=3);
		
		//关系运算符优先级
		System.out.print(nTest1>nTest2 == nTest3>nTest4);
		//上条语句等价于
		System.out.print((nTest1>nTest2)==(nTest3>nTest4));
		
		//关系运算符优先级低于算数运算符
		System.out.print( nTest1 > (nTest3+nTest4));
		//上条语句等价于
		System.out.print(nTest> nTest3 + nTest4);
	}
	
	/*************逻辑运算符*************/
	//Logical Operators
	
	public void LogicalOperators() {

		//逻辑运算符
		//与
		System.out.print( nTest1 >nTest2 && (nTest3>nTest4));
		//或
		System.out.print( nTest1 >nTest2 || (nTest3>nTest4));	
		//非
		System.out.print( !(nTest1 >nTest2));	
	}
	
	/*************条件运算符*************/
	//Conditional operator
	
	public void ConditionalOperator() {
		
		int max = nTest1> nTest2 ? nTest1+nTest2 : nTest3;
		System.out.print(max);
		//优先级高于赋值，低于算数和关系运算符
		//上语句等价于
		max = (nTest1> nTest2) ? (nTest1+nTest2) : nTest3;
		System.out.print(max);
		
		//结合性从左至右
		max = nTest1 > nTest2 ? nTest3 : nTest3>nTest4 ? nTest3 :nTest4;
		//等价于
		max = nTest1 > nTest2 ? nTest3 : (nTest3>nTest4 ? nTest3:nTest4);
	}
	
	/*************其他运算符*************/
	//Others Operators
	
	//位运算
	//Bitwise
	public void Bitwise()
	{
		int nBTest1 = 0;
		int nBTest2 = 1;
		
		//与
		System.out.print(nBTest1 & nBTest1); //0
		
		System.out.print(nBTest2 & nBTest2); //1
		
		System.out.print(nBTest1 & nBTest2); //0 
		
		//或
		
		System.out.print(nBTest1 | nBTest1); //0
		
		System.out.print(nBTest2 | nBTest2); //1
		
		System.out.print(nBTest1 | nBTest2); //1 
		
		//取反
		
		System.out.print(~nBTest1); //1
		
		System.out.print(~nBTest2); //0
		
		//异或
		
		System.out.print(nBTest1 | nBTest1); //0
		
		System.out.print(nBTest2 | nBTest2); //0
		
		System.out.print(nBTest1 | nBTest2); //1 
	}
	
	//Displacement operator
	 public void DisplacementOperator() {
		
		 nTest = -2;
		 System.out.print(nTest<<1); //-2
		 System.out.print("\r\n");
		 System.out.print(nTest>>1); //-1 算数运算1填充
		 System.out.print("\r\n");
		 System.out.print(nTest>>>1); //2147483647 逻辑运算0填充
	}
}
