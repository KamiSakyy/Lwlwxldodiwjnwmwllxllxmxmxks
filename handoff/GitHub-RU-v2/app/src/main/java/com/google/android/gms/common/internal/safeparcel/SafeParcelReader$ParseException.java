package com.google.android.gms.common.internal.safeparcel;

import a0.s0;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SafeParcelReader$ParseException(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        s0.w(dataPosition, str, " Parcel: pos=", " size=", sb);
        sb.append(dataSize);
    }
}
