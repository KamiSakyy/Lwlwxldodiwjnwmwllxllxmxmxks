package he;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class q {

    /* renamed from: r, reason: collision with root package name */
    public static final q f25628r;

    /* renamed from: s, reason: collision with root package name */
    public static final q f25629s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ q[] f25630t;

    static {
        q qVar = new q("REVIEW_REQUESTED", 0);
        f25628r = qVar;
        q qVar2 = new q("PENDING_REVIEW", 1);
        f25629s = qVar2;
        q[] qVarArr = {qVar, qVar2};
        f25630t = qVarArr;
        l0.t(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f25630t.clone();
    }
}
