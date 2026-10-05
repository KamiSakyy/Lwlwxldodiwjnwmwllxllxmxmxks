package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j6 implements Map.Entry, Comparable {
    public final Comparable r;
    public Object s;
    public final /* synthetic */ i6 t;

    public j6(i6 i6Var, Comparable comparable, Object obj) {
        this.t = i6Var;
        this.r = comparable;
        this.s = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.r.compareTo(((j6) obj).r);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.r;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.s;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.r;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.s;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.t.f();
        Object obj2 = this.s;
        this.s = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.r);
        String valueOf2 = String.valueOf(this.s);
        return no.a.q(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
