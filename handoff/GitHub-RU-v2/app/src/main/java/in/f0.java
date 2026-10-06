package in;

import com.github.service.models.ApiRequestStatus;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 {
    public final String a;
    public final String b;
    public final boolean c;

    public f0(ApiRequestStatus apiRequestStatus, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = apiRequestStatus == ApiRequestStatus.SUCCESS || apiRequestStatus == ApiRequestStatus.FAILURE;
    }
}
