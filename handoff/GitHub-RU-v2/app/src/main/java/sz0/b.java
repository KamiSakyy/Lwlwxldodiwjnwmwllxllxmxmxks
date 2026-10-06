package sz0;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public static final a Companion;
    public static final b s;
    public static final b t;
    public static final /* synthetic */ b[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        b bVar = new b("WEB", 0, "WEB");
        b bVar2 = new b("MANAGED", 1, "MANAGED");
        b bVar3 = new b("APPLE", 2, "APPLE");
        b bVar4 = new b("GOOGLE", 3, "GOOGLE");
        s = bVar4;
        b bVar5 = new b("UNKNOWN", 4, "UNKNOWN");
        b bVar6 = new b("UNKNOWN__", 5, "UNKNOWN__");
        t = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        u = bVarArr;
        v = l0.t(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.r = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) u.clone();
    }
    public Object a = null;
}
