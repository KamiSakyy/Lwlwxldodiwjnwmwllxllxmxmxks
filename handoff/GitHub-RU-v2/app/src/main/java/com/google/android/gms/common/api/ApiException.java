package com.google.android.gms.common.api;

/* loaded from: /home/user/work/p/classes4.dex */
public class ApiException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(Status status) {
        super(r3.toString());
        int i = status.r;
        String str = status.s;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
    }
}
