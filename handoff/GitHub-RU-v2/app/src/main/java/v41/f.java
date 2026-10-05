package v41;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public static final f r;
    public static final HashMap s;
    public static final /* synthetic */ f[] t;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("X86_32", 0);
        f fVar2 = new f("X86_64", 1);
        f fVar3 = new f("ARM_UNKNOWN", 2);
        f fVar4 = new f("PPC", 3);
        f fVar5 = new f("PPC64", 4);
        f fVar6 = new f("ARMV6", 5);
        f fVar7 = new f("ARMV7", 6);
        f fVar8 = new f("UNKNOWN", 7);
        r = fVar8;
        f fVar9 = new f("ARMV7S", 8);
        f fVar10 = new f("ARM64", 9);
        t = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        HashMap hashMap = new HashMap(4);
        s = hashMap;
        hashMap.put("armeabi-v7a", fVar7);
        hashMap.put("armeabi", fVar6);
        hashMap.put("arm64-v8a", fVar10);
        hashMap.put("x86", fVar);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) t.clone();
    }
}
