import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths={"testData.xls"})
public class TestClass {
    @Test
    public void simplTestMethod(@Param(name="name")String name , @Param(name="age")int age , @Param(name="expectedOutput")int expectedOutput){
        System.out.println(age);

    }
}
