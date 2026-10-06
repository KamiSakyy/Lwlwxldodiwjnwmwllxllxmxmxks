package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class x1 implements f1, v71.z {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f1 f1897r;

    /* renamed from: s, reason: collision with root package name */
    public a71.h f1898s;

    public x1(f1 f1Var, a71.h hVar) {
        this.f1897r = f1Var;
        this.f1898s = hVar;
    }

    public final a71.h K() {
        return this.f1898s;
    }

    @Override // androidx.compose.runtime.i3
    public final Object getValue() {
        return this.f1897r.getValue();
    }

    @Override // androidx.compose.runtime.f1
    public final void setValue(Object obj) {
        this.f1897r.setValue(obj);
    }
}
