package k81;

import java.lang.ref.SoftReference;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        k71.k.g(cls, "type");
        v0 v0Var = new v0();
        v0Var.a = new SoftReference(null);
        return v0Var;
    }
}
