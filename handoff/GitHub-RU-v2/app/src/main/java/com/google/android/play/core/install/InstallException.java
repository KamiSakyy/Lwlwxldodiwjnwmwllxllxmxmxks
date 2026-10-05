package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import e41.a;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstallException(int i) {
        super(new Status(i, String.format(r1, "Install Error(%d): %s", r2, r3), null, null));
        String str;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = a.a;
        Integer valueOf2 = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = a.b;
            if (hashMap2.containsKey(valueOf2)) {
                str = ((String) hashMap.get(valueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) hashMap2.get(valueOf2)) + ")";
                if (i != 0) {
                    throw new IllegalArgumentException("errorCode should not be 0.");
                }
                return;
            }
        }
        str = "";
        if (i != 0) {
        }
    }
}
