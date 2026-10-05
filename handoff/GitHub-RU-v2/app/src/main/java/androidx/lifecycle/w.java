package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class w {

    /* renamed from: r, reason: collision with root package name */
    public static final w f2939r;

    /* renamed from: s, reason: collision with root package name */
    public static final w f2940s;

    /* renamed from: t, reason: collision with root package name */
    public static final w f2941t;

    /* renamed from: u, reason: collision with root package name */
    public static final w f2942u;

    /* renamed from: v, reason: collision with root package name */
    public static final w f2943v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w[] f2944w;

    static {
        w wVar = new w("DESTROYED", 0);
        f2939r = wVar;
        w wVar2 = new w("INITIALIZED", 1);
        f2940s = wVar2;
        w wVar3 = new w("CREATED", 2);
        f2941t = wVar3;
        w wVar4 = new w("STARTED", 3);
        f2942u = wVar4;
        w wVar5 = new w("RESUMED", 4);
        f2943v = wVar5;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5};
        f2944w = wVarArr;
        v8.l0.t(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2944w.clone();
    }
}
