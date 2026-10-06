package g61;

import a5.s;
import androidx.lifecycle.l1;
import b91.g;
import com.google.android.gms.measurement.internal.x3;
import fa1.m;
import fa1.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k71.k;
import l81.c;
import q81.q;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends m {
    public q a;
    public x3 b;

    public a(q qVar, x3 x3Var) {
        this.a = qVar;
        this.b = x3Var;
    }

    public final n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, l1 l1Var) {
        k.g(type, "type");
        k.g(annotationArr2, "methodAnnotations");
        x3 x3Var = this.b;
        return new s(this.a, g.I(((c) ((l81.n) x3Var.s)).b, type), x3Var, 20);
    }

    public final n b(Type type, Annotation[] annotationArr, l1 l1Var) {
        k.g(annotationArr, "annotations");
        x3 x3Var = this.b;
        return new e51.a(g.I(((c) ((l81.n) x3Var.s)).b, type), x3Var, false, 7);
    }

}
