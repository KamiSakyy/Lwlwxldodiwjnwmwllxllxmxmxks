package d;

import androidx.lifecycle.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class v extends b91.g {

    /* renamed from: a, reason: collision with root package name */
    public final u f20928a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f20929b;

    public v(c0 c0Var, u uVar) {
        k71.k.g(uVar, "callback");
        this.f20928a = uVar;
        this.f20929b = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.f20928a, vVar.f20928a) && k71.k.b(this.f20929b, vVar.f20929b);
    }

    public final int hashCode() {
        int hashCode = this.f20928a.hashCode() * 31;
        c0 c0Var = this.f20929b;
        return hashCode + (c0Var == null ? 0 : c0Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f20928a + ", owner=" + this.f20929b + ')';
    }
}
