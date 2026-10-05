package s3;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: r, reason: collision with root package name */
    public static final m f31704r;

    /* renamed from: s, reason: collision with root package name */
    public static final m f31705s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ m[] f31706t;

    static {
        m mVar = new m("Ltr", 0);
        f31704r = mVar;
        m mVar2 = new m("Rtl", 1);
        f31705s = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f31706t = mVarArr;
        l0.t(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f31706t.clone();
    }

    public m(Object... a) {
    }
}
