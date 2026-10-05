package androidx.constraintlayout.core.state;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: r, reason: collision with root package name */
    public static final i f2153r;

    /* renamed from: s, reason: collision with root package name */
    public static final i f2154s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f2155t;

    /* renamed from: u, reason: collision with root package name */
    public static final HashMap f2156u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i[] f2157v;

    static {
        i iVar = new i("SPREAD", 0);
        f2153r = iVar;
        i iVar2 = new i("SPREAD_INSIDE", 1);
        f2154s = iVar2;
        i iVar3 = new i("PACKED", 2);
        f2155t = iVar3;
        f2157v = new i[]{iVar, iVar2, iVar3};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        f2156u = hashMap2;
        hashMap.put("packed", iVar3);
        hashMap.put("spread_inside", iVar2);
        hashMap.put("spread", iVar);
        hashMap2.put("packed", 2);
        hashMap2.put("spread_inside", 1);
        hashMap2.put("spread", 0);
    }

    public static int a(String str) {
        HashMap hashMap = f2156u;
        if (hashMap.containsKey(str)) {
            return ((Integer) hashMap.get(str)).intValue();
        }
        return -1;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f2157v.clone();
    }
}
