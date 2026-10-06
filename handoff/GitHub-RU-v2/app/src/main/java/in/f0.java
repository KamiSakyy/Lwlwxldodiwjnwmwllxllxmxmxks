package in;

import com.github.service.models.ApiRequestStatus;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 {
    public String a;
    public String b;
    public boolean c;

    public f0(ApiRequestStatus apiRequestStatus, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = apiRequestStatus == ApiRequestStatus.SUCCESS || apiRequestStatus == ApiRequestStatus.FAILURE;
    }
}
