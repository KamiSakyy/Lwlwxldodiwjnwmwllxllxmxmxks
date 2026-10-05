package androidx.fragment.app.strictmode;

import androidx.fragment.app.a0;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: r, reason: collision with root package name */
    public final a0 f2644r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(a0 a0Var, String str) {
        super(str);
        k.g(a0Var, "fragment");
        this.f2644r = a0Var;
    }
}
