package fa1;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: /home/user/work/p/classes5.dex */
public final class l0 extends b {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i) {
        super(7);
        this.y = i;
    }

    @Override // fa1.b
    public String c(Method method, int i) {
        switch (this.y) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    break;
                } else {
                    break;
                }
        }
        return super.c(method, i);
    }

    @Override // fa1.b
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.y) {
        }
        return x0.k(method, cls, obj, objArr);
    }

    @Override // fa1.b
    public final boolean f(Method method) {
        switch (this.y) {
        }
        return method.isDefault();
    }
}
