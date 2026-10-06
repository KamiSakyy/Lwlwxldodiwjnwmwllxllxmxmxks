package k41;

import android.content.Context;
import android.text.TextUtils;
import b1.m;
import c21.uShadow;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = g21.d.a;
        uShadow.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static i a(Context context) {
        m mVar = new m(context);
        String z = mVar.z("google_app_id");
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        return new i(z, mVar.z("google_api_key"), mVar.z("firebase_database_url"), mVar.z("ga_trackingId"), mVar.z("gcm_defaultSenderId"), mVar.z("google_storage_bucket"), mVar.z("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return uShadow.j(this.b, iVar.b) && uShadow.j(this.a, iVar.a) && uShadow.j(this.c, iVar.c) && uShadow.j(this.d, iVar.d) && uShadow.j(this.e, iVar.e) && uShadow.j(this.f, iVar.f) && uShadow.j(this.g, iVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        m mVar = new m(this);
        mVar.a(this.b, "applicationId");
        mVar.a(this.a, "apiKey");
        mVar.a(this.c, "databaseUrl");
        mVar.a(this.e, "gcmSenderId");
        mVar.a(this.f, "storageBucket");
        mVar.a(this.g, "projectId");
        return mVar.toString();
    }
}
