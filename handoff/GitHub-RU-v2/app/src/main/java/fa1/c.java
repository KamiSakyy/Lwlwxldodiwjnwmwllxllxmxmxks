package fa1;

import androidx.lifecycle.l1;
import com.google.android.gms.measurement.internal.x3;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends m {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // fa1.m
    public n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, l1 l1Var) {
        switch (this.a) {
            case 0:
                if (q81.y.class.isAssignableFrom(x0.h(type))) {
                    return b.u;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, l1Var);
        }
    }

    @Override // fa1.m
    public final n b(Type type, Annotation[] annotationArr, l1 l1Var) {
        switch (this.a) {
            case 0:
                if (type == q81.c0.class) {
                    return x0.l(annotationArr, ga1.w.class) ? b.v : b.t;
                }
                if (type == Void.class) {
                    return b.x;
                }
                if (x0.b && type == w61.a0.class) {
                    return b.w;
                }
                return null;
            default:
                if (x0.h(type) != Optional.class) {
                    return null;
                }
                return new x3(14, l1Var.C(x0.g(0, (ParameterizedType) type), annotationArr));
        }
    }

}
