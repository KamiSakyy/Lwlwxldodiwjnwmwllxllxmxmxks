package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements n {
    public boolean r;

    public e(Boolean bool) {
        this.r = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.valueOf(this.r);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return Double.valueOf(true != this.r ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.r == ((e) obj).r;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.r;
        if (equals) {
            return new q(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return Boolean.valueOf(this.r).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        return Boolean.toString(this.r);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new e(Boolean.valueOf(this.r));
    }

    public final String toString() {
        return String.valueOf(this.r);
    }

    public e(Object... a) {
    }
    public Object i = null;
    public Object k = null;
    public Object clear() { return null; }
    public Object get(Object p1) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object values() { return null; }
}
