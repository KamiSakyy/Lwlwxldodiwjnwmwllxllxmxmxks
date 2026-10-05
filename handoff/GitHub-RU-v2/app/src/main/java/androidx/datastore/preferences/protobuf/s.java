package androidx.datastore.preferences.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class s implements Cloneable {

    /* renamed from: r, reason: collision with root package name */
    public final u f2374r;

    /* renamed from: s, reason: collision with root package name */
    public u f2375s;

    public s(u uVar) {
        this.f2374r = uVar;
        if (uVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2375s = uVar.i();
    }

    public final u a() {
        u b10 = b();
        b10.getClass();
        if (u.f(b10, true)) {
            return b10;
        }
        throw new UninitializedMessageException();
    }

    public final u b() {
        if (!this.f2375s.g()) {
            return this.f2375s;
        }
        u uVar = this.f2375s;
        uVar.getClass();
        q0 q0Var = q0.f2366c;
        q0Var.getClass();
        q0Var.a(uVar.getClass()).b(uVar);
        uVar.h();
        return this.f2375s;
    }

    public final void c() {
        if (this.f2375s.g()) {
            return;
        }
        u i = this.f2374r.i();
        u uVar = this.f2375s;
        q0 q0Var = q0.f2366c;
        q0Var.getClass();
        q0Var.a(i.getClass()).a(i, uVar);
        this.f2375s = i;
    }

    public final Object clone() {
        s sVar = (s) this.f2374r.c(5);
        sVar.f2375s = b();
        return sVar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u<T1,T2,T3,T4> {
        public u() {
        }
    }
}
