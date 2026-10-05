package in;

import com.github.rudroid.common.e;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.ApiRequestStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public final /* synthetic */ a1 w;
    public final /* synthetic */ androidx.lifecycle.b x;
    public final /* synthetic */ j71.c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(a1 a1Var, androidx.lifecycle.b bVar, j71.c cVar, a71.c cVar2, int i) {
        super(2, cVar2);
        this.v = i;
        this.w = a1Var;
        this.x = bVar;
        this.y = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new x0(this.w, this.x, this.y, cVar, 0);
            default:
                return new x0(this.w, this.x, this.y, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        q81.a0 e;
        ApiRequestStatus apiRequestStatus;
        String str;
        int i = this.v;
        j71.c cVar = this.y;
        androidx.lifecycle.b bVar = this.x;
        a1 a1Var = this.w;
        switch (i) {
            case 0:
                qe.a aVar = a1Var.e;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                try {
                    e = a1Var.a.b(bVar).e();
                    int i2 = e.u;
                    try {
                        if (e.H) {
                            apiRequestStatus = ApiRequestStatus.SUCCESS;
                        } else {
                            IOException iOException = new IOException("failed to submit support request: " + i2);
                            e.a aVar3 = com.github.rudroid.common.e.Companion;
                            aVar.b("HelpHubSupport", iOException, true);
                            cVar.k(new ApiFailure(ApiFailureType.SERVER_ERROR, e.t, (String) null, new Integer(i2), (ArrayList) null, (Map) null, (Throwable) null, 112));
                            apiRequestStatus = ApiRequestStatus.FAILURE;
                        }
                        e.close();
                        return apiRequestStatus;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Exception unused) {
                    IOException iOException2 = new IOException("failed to submit support request with exception.");
                    e.a aVar4 = com.github.rudroid.common.e.Companion;
                    aVar.b("HelpHubSupport", iOException2, true);
                    return ApiRequestStatus.FAILURE;
                }
            default:
                qe.a aVar5 = a1Var.e;
                b71.a aVar6 = b71.a.r;
                sy.y.j(obj);
                try {
                    e = a1Var.f.b(bVar).e();
                    int i3 = e.u;
                    try {
                        if (e.H) {
                            JSONObject jSONObject = new JSONObject(e.x.t());
                            if (jSONObject.has("upload")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("upload");
                                if (jSONObject2.has("token")) {
                                    str = jSONObject2.getString("token");
                                    e.close();
                                    return str;
                                }
                            }
                        } else {
                            IOException iOException3 = new IOException("failed to upload support request attachment: " + i3);
                            e.a aVar7 = com.github.rudroid.common.e.Companion;
                            aVar5.b("HelpHubSupport", iOException3, true);
                            cVar.k(new ApiFailure(ApiFailureType.SERVER_ERROR, e.t, (String) null, new Integer(i3), (ArrayList) null, (Map) null, (Throwable) null, 112));
                        }
                        str = null;
                        e.close();
                        return str;
                    } finally {
                    }
                } catch (Exception unused2) {
                    IOException iOException4 = new IOException("failed to upload support request attachment with exception.");
                    e.a aVar8 = com.github.rudroid.common.e.Companion;
                    aVar5.b("HelpHubSupport", iOException4, true);
                    return null;
                }
        }
    }
}
