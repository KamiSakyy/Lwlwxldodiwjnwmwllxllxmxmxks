package a61;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.i2;
import b6.p1;
import com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceInfoResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse;
import com.github.service.dotcom.models.response.copilot.serialization.PostMessageInput;
import com.github.service.dotcom.models.response.copilot.serialization.WebSearchReferenceResultResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import xn.d3;
import xn.e3;
import xn.f3;
import xn.h4;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 extends c71.j implements j71.e {
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public Object E;
    public final /* synthetic */ int v;
    public int w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, q0 q0Var, a71.c cVar) {
        super(2, cVar);
        this.v = 0;
        this.z = w0Var;
        this.D = q0Var;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new u0((w0) this.z, (q0) this.D, cVar);
            case 1:
                u0 u0Var = new u0((i2) this.y, (b6.m) this.z, (y1) this.A, (Context) this.B, (p1) this.C, (k6.v) this.D, (k6.u) this.E, cVar, 1);
                u0Var.x = obj;
                return u0Var;
            default:
                u0 u0Var2 = new u0((v00.v) this.y, (String) this.z, (List) this.A, (List) this.B, (String) this.C, (String) this.D, (String) this.E, cVar, 2);
                u0Var2.x = obj;
                return u0Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ((u0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 1:
                return ((u0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            default:
                return ((u0) r((a71.c) obj2, (x71.t) obj)).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0547, code lost:
    
        if ((r2 instanceof com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse.Complete) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x054b, code lost:
    
        if ((r2 instanceof com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse.Error) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x054d, code lost:
    
        r5 = java.util.UUID.randomUUID().toString();
        k71.k.f(r5, "toString(...)");
        r9.j(new w61.k(new com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse.Complete(r5), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x056a, code lost:
    
        r0.close();
        r9.e((java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0574, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0220, code lost:
    
        if (r0 == r10) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x004b, code lost:
    
        if (r0 == r10) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0646, code lost:
    
        if (r2 == r0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0630, code lost:
    
        if (r2 == r0) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06bb  */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object a;
        Object a2;
        Object b;
        k41.g gVar;
        q0 q0Var;
        a0Shadow a0Var;
        w0 w0Var;
        s0 s0Var;
        e61.g gVar2;
        v41.i iVar;
        e61.g gVar3;
        j jVar;
        v41.i iVar2;
        k41.g gVar4;
        j jVar2;
        Object a3;
        w61.a0Shadow a0Var2;
        Object f;
        kotlinx.serialization.json.c cVar;
        hz.a aVar;
        Iterator it;
        w61.a0Shadow a0Var3;
        Object obj2;
        ChatMessageReferenceResponse.FileReferenceResponse webSearchReferenceResponse;
        hz.d dVar;
        hz.g gVar5;
        f3 f3Var;
        d3 d3Var;
        d3 d3Var2;
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTime2;
        Double u;
        String readLine;
        int i;
        List list;
        String str;
        int i2 = this.v;
        w61.a0Shadow a0Var4 = w61.a0.a;
        Object obj3 = this.D;
        Object obj4 = this.z;
        switch (i2) {
            case 0:
                w0 w0Var2 = (w0) obj4;
                b71.a aVar2 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    a = w0.a(w0Var2, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            sy.y.j(obj);
                            a2 = obj;
                            a0Shadow a0Var5 = (a0Shadow) a2;
                            s0 s0Var2 = s0.a;
                            k41.g gVar6 = w0Var2.a;
                            q0 q0Var2 = (q0) obj3;
                            e61.g gVar7 = w0Var2.c;
                            b61.c cVar2 = b61.c.a;
                            this.x = a0Var5;
                            this.y = w0Var2;
                            this.A = s0Var2;
                            this.B = gVar6;
                            this.C = q0Var2;
                            this.E = gVar7;
                            this.w = 3;
                            b = cVar2.b(this);
                            if (b != aVar2) {
                                gVar = gVar6;
                                q0Var = q0Var2;
                                a0Var = a0Var5;
                                w0Var = w0Var2;
                                s0Var = s0Var2;
                                gVar2 = gVar7;
                                Map map = (Map) b;
                                String str2 = a0Var.a;
                                String str3 = a0Var.b;
                                s0Var.getClass();
                                k71.k.g(gVar, "firebaseApp");
                                k71.k.g(q0Var, "sessionDetails");
                                k71.k.g(gVar2, "sessionsSettings");
                                k71.k.g(map, "subscribers");
                                k71.k.g(str3, "firebaseAuthenticationToken");
                                String str4 = q0Var.a;
                                String str5 = q0Var.b;
                                int i4 = q0Var.c;
                                long j = q0Var.d;
                                iVar = (v41.i) map.get(b61.d.s);
                                j jVar3 = j.u;
                                j jVar4 = j.t;
                                j jVar5 = j.s;
                                if (iVar != null) {
                                }
                                iVar2 = (v41.i) map.get(b61.d.r);
                                if (iVar2 != null) {
                                }
                                r0 r0Var = new r0(new z0(str4, str5, i4, j, new k(jVar, jVar2, gVar3.a()), str2, str3), s0.a(gVar4));
                                int i5 = w0.g;
                                w0Var.getClass();
                                w0Var.d.a(r0Var);
                                return a0Var4;
                            }
                            return aVar2;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gVar2 = (e61.g) this.E;
                        q0Var = (q0) this.C;
                        k41.g gVar8 = (k41.g) this.B;
                        s0 s0Var3 = (s0) this.A;
                        w0 w0Var3 = (w0) this.y;
                        a0Shadow a0Var6 = (a0Shadow) this.x;
                        sy.y.j(obj);
                        a0Var = a0Var6;
                        w0Var = w0Var3;
                        s0Var = s0Var3;
                        gVar = gVar8;
                        b = obj;
                        Map map2 = (Map) b;
                        String str22 = a0Var.a;
                        String str32 = a0Var.b;
                        s0Var.getClass();
                        k71.k.g(gVar, "firebaseApp");
                        k71.k.g(q0Var, "sessionDetails");
                        k71.k.g(gVar2, "sessionsSettings");
                        k71.k.g(map2, "subscribers");
                        k71.k.g(str32, "firebaseAuthenticationToken");
                        String str42 = q0Var.a;
                        String str52 = q0Var.b;
                        int i42 = q0Var.c;
                        long j2 = q0Var.d;
                        iVar = (v41.i) map2.get(b61.d.s);
                        j jVar32 = j.u;
                        j jVar42 = j.t;
                        j jVar52 = j.s;
                        if (iVar != null) {
                            gVar3 = gVar2;
                            jVar = jVar52;
                        } else if (iVar.a.a()) {
                            gVar3 = gVar2;
                            jVar = jVar42;
                        } else {
                            gVar3 = gVar2;
                            jVar = jVar32;
                        }
                        iVar2 = (v41.i) map2.get(b61.d.r);
                        if (iVar2 != null) {
                            gVar4 = gVar;
                            jVar2 = jVar52;
                        } else if (iVar2.a.a()) {
                            jVar2 = jVar42;
                            gVar4 = gVar;
                        } else {
                            gVar4 = gVar;
                            jVar2 = jVar32;
                        }
                        r0 r0Var2 = new r0(new z0(str42, str52, i42, j2, new k(jVar, jVar2, gVar3.a()), str22, str32), s0.a(gVar4));
                        int i52 = w0.g;
                        w0Var.getClass();
                        try {
                            w0Var.d.a(r0Var2);
                        } catch (RuntimeException unused) {
                        }
                        return a0Var4;
                    }
                    sy.y.j(obj);
                    a = obj;
                }
                if (((Boolean) a).booleanValue()) {
                    q51.d dVar2 = w0Var2.b;
                    this.w = 2;
                    a2 = a0.c.a(dVar2, this);
                    break;
                }
                return a0Var4;
            case 1:
                b71.a aVar3 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    sy.y.j(obj);
                    v71.z zVar = (v71.z) this.x;
                    k71.v vVar = new k71.v();
                    i2 i2Var = (i2) this.y;
                    vVar.r = i2Var.a;
                    y1 y1Var = i2Var.v;
                    k6.r rVar = new k6.r((b6.m) obj4, i2Var, vVar, (y1) this.A, (Context) this.B, (p1) this.C, (k6.v) obj3, (k6.u) this.E, zVar, (a71.c) null);
                    this.w = 1;
                    if (n1.k(y1Var, rVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var4;
            default:
                v00.v vVar2 = (v00.v) this.y;
                x71.s sVar = (x71.t) this.x;
                b71.a aVar4 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    sy.y.j(obj);
                    this.x = sVar;
                    this.w = 1;
                    a3 = vVar2.u.a(vVar2.t, mp.b.class, this);
                    break;
                } else if (i7 == 1) {
                    sy.y.j(obj);
                    a3 = obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    f = obj;
                    a0Var2 = a0Var4;
                    fa1.q0 q0Var3 = (fa1.q0) f;
                    q81.n nVar = q0Var3.a.w;
                    e3 e3Var = f3.Companion;
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    k71.k.f(comparator, "CASE_INSENSITIVE_ORDER");
                    TreeMap treeMap = new TreeMap(comparator);
                    int size = nVar.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String b2 = nVar.b(i8);
                        Locale locale = Locale.US;
                        k71.k.f(locale, "US");
                        String lowerCase = b2.toLowerCase(locale);
                        k71.k.f(lowerCase, "toLowerCase(...)");
                        List list2 = (List) treeMap.get(lowerCase);
                        if (list2 == null) {
                            list2 = new ArrayList(2);
                            treeMap.put(lowerCase, list2);
                        }
                        list2.add(nVar.e(i8));
                    }
                    e3Var.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (t71.w.F((String) entry.getKey(), "X-Quota-Snapshot-", false)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        f3Var = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            String str6 = (String) entry2.getKey();
                            List list3 = (List) entry2.getValue();
                            String a0 = t71.p.a0(str6, "X-Quota-Snapshot-");
                            String str7 = (String) x61.m.W(list3);
                            if (str7 != null) {
                                f3.Companion.getClass();
                                List f0 = t71.p.f0(str7, new char[]{'&'}, 6);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = f0.iterator();
                                while (it2.hasNext()) {
                                    List f02 = t71.p.f0((String) it2.next(), new char[]{'='}, 2);
                                    w61.k kVar = f02.size() == 2 ? new w61.k(f02.get(0), Uri.decode((String) f02.get(1))) : null;
                                    if (kVar != null) {
                                        arrayList2.add(kVar);
                                    }
                                }
                                Map A = x61.x.A(arrayList2);
                                String str8 = (String) A.get("ent");
                                Integer G = str8 != null ? t71.w.G(str8) : null;
                                String str9 = (String) A.get("ov");
                                Integer valueOf = (str9 == null || (u = t71.v.u(str9)) == null) ? null : Integer.valueOf((int) u.doubleValue());
                                String str10 = (String) A.get("rem");
                                Double u2 = str10 != null ? t71.v.u(str10) : null;
                                String str11 = (String) A.get("ovPerm");
                                boolean z = str11 != null && Boolean.parseBoolean(str11);
                                String str12 = (String) A.get("rst");
                                if (G == null || valueOf == null || u2 == null) {
                                    d3Var2 = null;
                                } else {
                                    int intValue = G.intValue();
                                    double doubleValue = u2.doubleValue();
                                    int intValue2 = valueOf.intValue();
                                    if (str12 != null) {
                                        try {
                                            zonedDateTime = Instant.parse(str12).atZone(ZoneId.systemDefault());
                                        } catch (Exception unused2) {
                                            zonedDateTime = null;
                                        }
                                        zonedDateTime2 = zonedDateTime;
                                    } else {
                                        zonedDateTime2 = null;
                                    }
                                    d3Var2 = new d3(intValue, doubleValue, intValue2, zonedDateTime2, z);
                                }
                                d3Var = d3Var2;
                            } else {
                                d3Var = null;
                            }
                            w61.k kVar2 = d3Var != null ? new w61.k(a0, d3Var) : null;
                            if (kVar2 != null) {
                                arrayList.add(kVar2);
                            }
                        }
                        f3Var = new f3(x61.x.A(arrayList));
                    }
                    q81.c0 c0Var = (q81.c0) q0Var3.b;
                    if (c0Var == null) {
                        throw new IOException("No body in response");
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0Var.r().G0(), t71.a.a), 8192);
                    ChatServerSentEventDataResponse.Debug debug = null;
                    while (true) {
                        a71.h hVar = this.s;
                        k71.k.d(hVar);
                        if (v71.b0.v(hVar) && (readLine = bufferedReader.readLine()) != null) {
                            if (!t71.p.T(readLine)) {
                                if (readLine.length() <= 0) {
                                    readLine = null;
                                }
                                if (readLine != null) {
                                    i = 0;
                                    list = t71.p.f0(readLine, new char[]{':'}, 2);
                                } else {
                                    i = 0;
                                    list = null;
                                }
                                String str13 = list != null ? (String) x61.m.X(i, list) : null;
                                String a02 = (list == null || (str = (String) x61.m.X(1, list)) == null) ? null : t71.p.a0(str, " ");
                                if (a02 == null) {
                                    a02 = "";
                                }
                                int ordinal = (k71.k.b(str13, "event") ? gz.d.s : k71.k.b(str13, "data") ? gz.d.r : gz.d.t).ordinal();
                                if (ordinal == 0) {
                                    l81.n nVar2 = vVar2.s;
                                    nVar2.getClass();
                                    debug = (com.github.service.dotcom.models.response.copilot.serialization.c) nVar2.a(a02, com.github.service.dotcom.models.response.copilot.serialization.c.Companion.serializer());
                                    if ((debug instanceof ChatServerSentEventDataResponse.Error) || (debug instanceof ChatServerSentEventDataResponse.Complete)) {
                                        x71.s sVar2 = sVar;
                                        sVar2.j(new w61.k(debug, f3Var));
                                        sVar2.e((Throwable) null);
                                    } else if (debug instanceof ChatServerSentEventDataResponse.Content) {
                                        sVar.u.j(new w61.k(debug, f3Var));
                                    } else if (debug instanceof ChatServerSentEventDataResponse.AgentConfirmation) {
                                        sVar.u.j(new w61.k(debug, f3Var));
                                    } else if (debug instanceof ChatServerSentEventDataResponse.FunctionCall) {
                                        ChatServerSentEventDataResponse.FunctionCall functionCall = (ChatServerSentEventDataResponse.FunctionCall) debug;
                                        if (functionCall.c == hz.l.s) {
                                            sVar.j(new w61.k(debug, f3Var));
                                        }
                                        c71.g.a(Log.d("RetrofitCopilotChatService", "function call message: " + t.e.f(functionCall)));
                                    } else if (debug instanceof ChatServerSentEventDataResponse.Debug) {
                                        c71.g.a(Log.d("RetrofitCopilotChatService", "debug message: " + debug.b));
                                    } else {
                                        if (!(debug instanceof ChatServerSentEventDataResponse.Unknown)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        c71.g.a(Log.d("RetrofitCopilotChatService", "unknown streamed message type"));
                                    }
                                } else {
                                    if (ordinal != 1 && ordinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c71.g.a(Log.d("RetrofitCopilotChatService", "unknown server sent event type"));
                                }
                            }
                        }
                    }
                }
                mp.b bVar = (mp.b) a3;
                String str14 = (String) obj4;
                List list4 = (List) this.A;
                k71.k.g(list4, "<this>");
                ArrayList arrayList3 = new ArrayList(x61.n.F(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    xn.h0Shadow h0Var = (xn.l0) it3.next();
                    if (h0Var instanceof xn.h0) {
                        xn.h0Shadow h0Var2 = h0Var;
                        it = it3;
                        a0Var3 = a0Var4;
                        webSearchReferenceResponse = new ChatMessageReferenceResponse.FileReferenceResponse(h0Var2.r, h0Var2.s, h0Var2.t, h0Var2.u, h0Var2.v, h0Var2.w, h0Var2.x);
                        obj2 = obj3;
                    } else {
                        it = it3;
                        if (h0Var instanceof xn.j0) {
                            xn.j0Shadow j0Var = (xn.j0) h0Var;
                            int i9 = j0Var.r;
                            String str15 = j0Var.s;
                            String str16 = j0Var.t;
                            int ordinal2 = j0Var.u.ordinal();
                            if (ordinal2 == 0) {
                                dVar = hz.d.s;
                            } else if (ordinal2 == 1) {
                                dVar = hz.d.t;
                            } else {
                                if (ordinal2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar = hz.d.u;
                            }
                            hz.d dVar3 = dVar;
                            String str17 = j0Var.v;
                            String str18 = j0Var.w;
                            String str19 = j0Var.x;
                            String str20 = j0Var.y;
                            xn.m0 m0Var = j0Var.z;
                            a0Var3 = a0Var4;
                            ChatMessageReferenceInfoResponse chatMessageReferenceInfoResponse = new ChatMessageReferenceInfoResponse(m0Var.r, m0Var.s);
                            int ordinal3 = j0Var.A.ordinal();
                            if (ordinal3 == 0) {
                                gVar5 = hz.g.s;
                            } else if (ordinal3 == 1) {
                                gVar5 = hz.g.t;
                            } else {
                                if (ordinal3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                gVar5 = hz.g.u;
                            }
                            obj2 = obj3;
                            webSearchReferenceResponse = new ChatMessageReferenceResponse.RepositoryReferenceResponse(i9, str15, str16, dVar3, str17, str18, str19, str20, chatMessageReferenceInfoResponse, gVar5);
                        } else {
                            a0Var3 = a0Var4;
                            if (!(h0Var instanceof xn.k0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xn.k0 k0Var = (xn.k0) h0Var;
                            String str21 = k0Var.r;
                            String str23 = k0Var.s;
                            ArrayList arrayList4 = k0Var.t;
                            ArrayList arrayList5 = new ArrayList(x61.n.F(arrayList4, 10));
                            int i10 = 0;
                            for (int size2 = arrayList4.size(); i10 < size2; size2 = size2) {
                                Object obj5 = arrayList4.get(i10);
                                i10++;
                                h4 h4Var = (h4) obj5;
                                arrayList5.add(new WebSearchReferenceResultResponse(h4Var.r, h4Var.s, h4Var.t));
                                arrayList4 = arrayList4;
                                obj3 = obj3;
                            }
                            obj2 = obj3;
                            webSearchReferenceResponse = new ChatMessageReferenceResponse.WebSearchReferenceResponse(str21, str23, arrayList5);
                        }
                    }
                    arrayList3.add(webSearchReferenceResponse);
                    it3 = it;
                    obj3 = obj2;
                    a0Var4 = a0Var3;
                }
                a0Var2 = a0Var4;
                Object obj6 = obj3;
                List<xn.b0> list5 = (List) this.B;
                k71.k.g(list5, "<this>");
                ArrayList arrayList6 = new ArrayList(x61.n.F(list5, 10));
                for (xn.b0 b0Var : list5) {
                    try {
                        l81.b bVar2 = l81.c.d;
                        String str24 = b0Var.b;
                        bVar2.getClass();
                        k71.k.g(str24, "string");
                        cVar = l81.j.e((kotlinx.serialization.json.b) bVar2.a(str24, l81.k.a));
                    } catch (Exception e) {
                        e.getMessage();
                        cVar = new kotlinx.serialization.json.c(x61.s.r);
                    }
                    xn.c0 c0Var2 = b0Var.a;
                    k71.k.g(c0Var2, "<this>");
                    int ordinal4 = c0Var2.ordinal();
                    if (ordinal4 == 0) {
                        aVar = hz.a.s;
                    } else if (ordinal4 == 1) {
                        aVar = hz.a.t;
                    } else {
                        if (ordinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = hz.a.u;
                    }
                    arrayList6.add(new ChatClientConfirmationResponse(aVar, t.a0.L(cVar)));
                }
                PostMessageInput postMessageInput = new PostMessageInput((String) this.C, "conversation", arrayList3, (String) obj6, (String) this.E, arrayList6);
                this.x = sVar;
                this.w = 2;
                f = bVar.f(str14, postMessageInput, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
        this.D = obj6;
        this.E = obj7;
    }
}
