package in;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.google.android.gms.internal.measurement.b4;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLException;
import kotlin.NoWhenBranchMatchedException;
import t00.f8;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r {
    public static final Set a;
    public static final Set b;

    static {
        ApiFailureType apiFailureType = ApiFailureType.TRADE_CONTROLS;
        ApiFailureType apiFailureType2 = ApiFailureType.SAML;
        ApiFailureType apiFailureType3 = ApiFailureType.IP_ALLOW_LIST;
        a = x61.l.j0(new ApiFailureType[]{apiFailureType, apiFailureType2, apiFailureType3});
        b = x61.l.j0(new ApiFailureType[]{ApiFailureType.NOT_FOUND, apiFailureType3});
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p0 a(aa.f fVar, boolean z, Set set, Set set2, j71.c cVar, j71.e eVar) {
        ApiFailureType apiFailureType;
        ApiFailure apiFailure;
        aa.b0 b0Var;
        aa.b0 b0Var2;
        aa.b0 b0Var3;
        Object obj;
        aa.r0 r0Var = fVar.c;
        List list = fVar.d;
        List list2 = x61.r.r;
        if (r0Var != null) {
            if ((list == null ? list2 : list).isEmpty()) {
                apiFailure = null;
                if (apiFailure != null) {
                    ApiFailureType apiFailureType2 = apiFailure.r;
                    if ((r0Var != null && (set.contains(apiFailureType2) || (apiFailure.v.contains("nodes") && set2.contains(apiFailureType2)))) && !z) {
                        if (r0Var != null && ((Boolean) cVar.k(r0Var)).booleanValue()) {
                            o0 o0Var = r0Var != null ? new o0((ApiFailure) eVar.s(r0Var, apiFailure), r0Var) : null;
                            if (o0Var != null) {
                                return o0Var;
                            }
                        }
                    }
                    throw ((Throwable) eVar.s(r0Var, apiFailure));
                }
                if (r0Var == null) {
                    return new s0(r0Var);
                }
                return null;
            }
        }
        if (list != null && (b0Var3 = (aa.b0) x61.m.W(list)) != null) {
            Map map = b0Var3.e;
            if (map != null && (obj = map.get("type")) != null) {
                if (obj.equals("TRADE_CONTROLS")) {
                    apiFailureType = ApiFailureType.TRADE_CONTROLS;
                } else {
                    if (obj.equals("FORBIDDEN")) {
                        Map map2 = b0Var3.d;
                        if (map2 != null ? k71.k.b(map2.get("saml_failure"), Boolean.TRUE) : false) {
                            apiFailureType = ApiFailureType.SAML;
                        }
                    }
                    if (obj.equals("NO_ROOT_COMMIT")) {
                        apiFailureType = ApiFailureType.NO_ROOT_COMMIT;
                    } else if (obj.equals("INSUFFICIENT_SCOPES")) {
                        apiFailureType = ApiFailureType.INSUFFICIENT_SCOPES;
                    } else if (obj.equals("NOT_FOUND")) {
                        apiFailureType = ApiFailureType.NOT_FOUND;
                    } else if (obj.equals("FORBIDDEN") && t71.p.I(b0Var3.a, "IP allow list", true)) {
                        apiFailureType = ApiFailureType.IP_ALLOW_LIST;
                    }
                }
            }
            apiFailureType = null;
        }
        apiFailureType = ApiFailureType.RESPONSE_ERROR;
        ApiFailureType apiFailureType3 = apiFailureType;
        String str = (list == null || (b0Var2 = (aa.b0) x61.m.W(list)) == null) ? null : b0Var2.a;
        String name = fVar.b.name();
        List list3 = (list == null || (b0Var = (aa.b0) x61.m.W(list)) == null) ? null : b0Var.c;
        if (list3 != null) {
            list2 = list3;
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        apiFailure = new ApiFailure(apiFailureType3, str, name, (Integer) null, arrayList, (Map) null, (Throwable) null, 32);
        if (apiFailure != null) {
        }
        if (r0Var == null) {
        }
    }

    public static final ApiFailure b(ApolloException apolloException, String str) {
        if (apolloException instanceof ApolloNetworkException) {
            ApolloNetworkException apolloNetworkException = (ApolloNetworkException) apolloException;
            Throwable cause = apolloNetworkException.getCause();
            if (!(cause instanceof IOException)) {
                return new ApiFailure(ApiFailureType.HTTP_ERROR, (String) null, str, (Integer) null, (ArrayList) null, (Map) null, apolloNetworkException, 48);
            }
            IOException iOException = (IOException) cause;
            return new ApiFailure(iOException instanceof SSLException ? ApiFailureType.SSL_ERROR : iOException instanceof UnknownHostException ? ApiFailureType.NO_NETWORK : ApiFailureType.UNKNOWN_IO, (String) null, str, (Integer) null, (ArrayList) null, (Map) null, apolloNetworkException, 48);
        }
        if (apolloException instanceof ApolloHttpException) {
            return b4.I(apolloException.getMessage(), ((ApolloHttpException) apolloException).r, str);
        }
        if (apolloException instanceof ApolloParseException) {
            return new ApiFailure(ApiFailureType.PARSE_ERROR, (String) null, str, (Integer) null, (ArrayList) null, (Map) null, apolloException, 48);
        }
        if (apolloException != null) {
            return new ApiFailure(ApiFailureType.CANCELED, (String) null, str, (Integer) null, (ArrayList) null, (Map) null, apolloException, 48);
        }
        if (apolloException == null) {
            throw new NoWhenBranchMatchedException();
        }
        List h = sy.u.h(apolloException);
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (obj instanceof ApolloHttpException) {
                arrayList.add(obj);
            }
        }
        ApolloHttpException apolloHttpException = (ApolloHttpException) x61.m.W(arrayList);
        if (apolloHttpException != null) {
            return b4.I(apolloHttpException.getMessage(), apolloHttpException.r, str);
        }
        return new ApiFailure(ApiFailureType.UNKNOWN, (String) null, str, (Integer) null, (ArrayList) null, (Map) null, apolloException, 48);
    }

    public static final c c(go0.n nVar, boolean z, Set set, Set set2, j71.c cVar, j71.e eVar, com.github.service.wrapper.i iVar) {
        k71.k.g(set, "partialErrorTypes");
        k71.k.g(set2, "partialNodeErrorTypes");
        k71.k.g(eVar, "addFailureMetaData");
        return new c(nVar, z, set, set2, cVar, eVar, iVar);
    }

    public static final f d(go0.n nVar, boolean z, Set set, Set set2, j71.c cVar, j71.e eVar) {
        k71.k.g(set, "partialErrorTypes");
        k71.k.g(set2, "partialNodeErrorTypes");
        k71.k.g(eVar, "addFailureMetaData");
        return new f(nVar, z, set, set2, cVar, eVar);
    }

    public static /* synthetic */ f e(go0.n nVar, j71.c cVar, j71.e eVar, int i) {
        return d(nVar, (i & 1) != 0, a, b, cVar, eVar);
    }

    public static y71.y f(y71.i iVar) {
        return new y71.y(iVar, new h(g.z, (a71.c) null));
    }

    public static final y00.l g(f8 f8Var, j71.c cVar, j71.c cVar2, j71.a aVar, j71.e eVar) {
        return n1.x(new l(cVar, cVar2, aVar, f8Var, eVar, null), f8Var);
    }

    public static y71.y h(y71.i iVar) {
        k71.k.g(iVar, "<this>");
        return f(new n(e(i(iVar, null), new id.a(23), new ie.d(2), 7), 0));
    }

    public static final go0.n i(y71.i iVar, String str) {
        k71.k.g(iVar, "<this>");
        return new go0.n(new y71.y(new gl.f(iVar, 4), new cn.r(str, (a71.c) null, 5)), str, 2);
    }

    public static final Object j(Object obj, String str, j71.c cVar) {
        k71.k.g(cVar, "block");
        if (obj != null) {
            return cVar.k(obj);
        }
        throw new ApiFailure(ApiFailureType.SERVER_ERROR, str, (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 112);
    }

    public static y71.y k(y71.i iVar) {
        k71.k.g(iVar, "<this>");
        return f(new n(e(i(iVar, null), new id.a(24), new ie.d(3), 6), 1));
    }

    public static final gl.f l(y71.i iVar) {
        k71.k.g(iVar, "<this>");
        return new gl.f(iVar, 6);
    }

    public static final y71.y m(y71.y yVar, com.github.service.wrapper.b bVar, aa.i0 i0Var, String str, j71.c cVar) {
        k71.k.g(bVar, "cachedClient");
        k71.k.g(str, "id");
        k71.w wVar = new k71.w();
        return new y71.y(new y71.y(new a0.i(wVar, bVar, i0Var, str, cVar, (a71.c) null, 5, false), yVar), new c00.a(wVar, bVar, i0Var, str, (a71.c) null));
    }
}
