package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class v {

    /* renamed from: r, reason: collision with root package name */
    public static final v f21239r;

    /* renamed from: s, reason: collision with root package name */
    public static final v f21240s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v[] f21241t;

    static {
        v vVar = new v("EditableText", 0);
        f21239r = vVar;
        v vVar2 = new v("StaticText", 1);
        f21240s = vVar2;
        v[] vVarArr = {vVar, vVar2};
        f21241t = vVarArr;
        v8.l0.t(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f21241t.clone();
    }
    public Object ordinal() { return null; }
}
