package g81;

import f0.b2;
import java.lang.annotation.Annotation;
import java.util.List;
import k71.k;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sy.w;
import w61.i;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b extends k81.b {
    public final r71.b a;
    public final List b;
    public final Object c;

    public b(r71.b bVar) {
        k.g(bVar, "baseClass");
        this.a = bVar;
        this.b = r.r;
        this.c = w.s(i.r, new b2(5, this));
    }

    @Override // k81.b
    public final r71.b c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    public b(k71.e eVar, Annotation[] annotationArr) {
        this(eVar);
        this.b = l.r(annotationArr);
    }
}
