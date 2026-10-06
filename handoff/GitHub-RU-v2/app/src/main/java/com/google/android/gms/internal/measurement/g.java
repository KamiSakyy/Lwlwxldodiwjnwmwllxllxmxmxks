package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements n {
    public Double r;

    public g(Double d) {
        if (d == null) {
            this.r = Double.valueOf(Double.NaN);
        } else {
            this.r = d;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        Double d = this.r;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.r.equals(((g) obj).r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(k());
        }
        throw new IllegalArgumentException(k() + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        Double d = this.r;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new g(this.r);
    }

    public final String toString() {
        return k();
    }
    public Object A() { return null; }
    public Object n(Object p1) { return null; }
    public Object u(Object p1) { return null; }
    public Object w(Object p1) { return null; }
}
