package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final i r;
    public static final i s;
    public static final /* synthetic */ i[] t;

    static {
        i iVar = new i("CHAT", 0);
        r = iVar;
        i iVar2 = new i("UNKNOWN", 1);
        s = iVar2;
        i[] iVarArr = {iVar, iVar2};
        t = iVarArr;
        v8.l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) t.clone();
    }
}
