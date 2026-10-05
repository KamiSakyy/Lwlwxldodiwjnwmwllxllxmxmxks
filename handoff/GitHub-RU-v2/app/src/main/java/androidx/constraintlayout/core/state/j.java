package androidx.constraintlayout.core.state;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: r, reason: collision with root package name */
    public static final HashMap f2158r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ j[] f2159s;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    static {
        j jVar = new j("NONE", 0);
        j jVar2 = new j("CHAIN", 1);
        j jVar3 = new j("ALIGNED", 2);
        f2159s = new j[]{jVar, jVar2, jVar3};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        f2158r = hashMap2;
        hashMap.put("none", jVar);
        hashMap.put("chain", jVar2);
        hashMap.put("aligned", jVar3);
        hashMap2.put("none", 0);
        hashMap2.put("chain", 3);
        hashMap2.put("aligned", 2);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2159s.clone();
    }
}
