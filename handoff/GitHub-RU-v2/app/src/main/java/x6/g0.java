package x6;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class g0 extends k0 {

    /* renamed from: s, reason: collision with root package name */
    public Class f33831s;

    public g0(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f33831s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // x6.k0, x6.l0
    public final String b() {
        return this.f33831s.getName();
    }

    @Override // x6.k0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        k71.k.g(str, "value");
        Class cls = this.f33831s;
        Object[] enumConstants = cls.getEnumConstants();
        k71.k.f(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (t71.w.y(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder v4 = f4Shadow.v("Enum value ", str, " not found for type ");
        v4.append(cls.getName());
        v4.append('.');
        throw new IllegalArgumentException(v4.toString());
    }
}
