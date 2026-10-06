package com.google.android.gms.measurement.internal;

import java.util.HashSet;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends i4 {
    public String v;
    public HashSet w;
    public x.e x;
    public Long y;
    public Long z;

    @Override // com.google.android.gms.measurement.internal.i4
    public final void C() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList D(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.D(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final w4 E(Integer num) {
        if (this.x.containsKey(num)) {
            return (w4) this.x.get(num);
        }
        w4 w4Var = new w4(this, this.v);
        this.x.put(num, w4Var);
        return w4Var;
    }
    public Object d(Object p1, Object p2) { return null; }
    public Object f(Object p1, Object p2) { return null; }
    public Object h() { return null; }
    public Object a = null;
    public Object t = null;
    public Object d(Object, int) { return null; }
    public Object f(Object, int) { return null; }
}
