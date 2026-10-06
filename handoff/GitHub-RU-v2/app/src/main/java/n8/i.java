package n8;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: r, reason: collision with root package name */
    public static final i f29665r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ i[] f29666s;

    static {
        i iVar = new i("STRICT", 0);
        i iVar2 = new i("LOG", 1);
        i iVar3 = new i("QUIET", 2);
        f29665r = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        f29666s = iVarArr;
        l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f29666s.clone();
    }
    public Object ordinal() { return null; }
}
