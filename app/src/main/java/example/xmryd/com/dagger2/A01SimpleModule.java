package example.xmryd.com.dagger2;

import dagger.Module;
import dagger.Provides;

//提供
@Module
public class A01SimpleModule {

    private A01SimpleActivity activity;

    public A01SimpleModule(A01SimpleActivity activity) {
        this.activity = activity;
    }

    //下面为新增代码：也可提供实例的工厂类
//    @Provides
//    Student provideStudent() {
//        return new Student();
//    }
}
