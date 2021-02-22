package example.xmryd.com.dagger2;

import dagger.Component;

@Component(modules = A01SimpleModule.class)
public interface A01SimpleComponent {

    void inject(A01SimpleActivity activity);

}
