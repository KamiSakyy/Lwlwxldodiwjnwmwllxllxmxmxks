package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new c0(15);
    public final Calendar r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public String x;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = t.a(calendar);
        this.r = a;
        this.s = a.get(2);
        this.t = a.get(1);
        this.u = a.getMaximum(7);
        this.v = a.getActualMaximum(5);
        this.w = a.getTimeInMillis();
    }

    public static m c(int i, int i2) {
        Calendar c = t.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new m(c);
    }

    public static m h(long j) {
        Calendar c = t.c(null);
        c.setTimeInMillis(j);
        return new m(c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.r.compareTo(((m) obj).r);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.s == mVar.s && this.t == mVar.t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.s), Integer.valueOf(this.t)});
    }

    public final String j() {
        if (this.x == null) {
            long timeInMillis = this.r.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = t.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.x = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.x;
    }

    public final int o(m mVar) {
        if (!(this.r instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (mVar.s - this.s) + ((mVar.t - this.t) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.t);
        parcel.writeInt(this.s);
    }
}
