package z41;

import android.util.Base64;
import android.util.JsonReader;
import java.util.List;
import y41.d1;
import y41.f1;
import y41.n2;
import y41.s0;
import y41.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements b {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // z41.b
    public final Object a(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        String str = null;
        int i = 3;
        switch (this.r) {
            case 0:
                d1 d1Var = new d1();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1536268810:
                            if (nextName.equals("parameterKey")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1027290370:
                            if (nextName.equals("templateVersion")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 1098747284:
                            if (nextName.equals("rolloutVariant")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1124454216:
                            if (nextName.equals("parameterValue")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            d1Var.b = nextString;
                            break;
                        case true:
                            d1Var.d = jsonReader.nextLong();
                            d1Var.e = (byte) (d1Var.e | 1);
                            break;
                        case true:
                            jsonReader.beginObject();
                            String str2 = null;
                            String str3 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (nextName2.equals("variantId")) {
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (nextName2.equals("rolloutId")) {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str2 != null && str3 != null) {
                                d1Var.a = new f1(str2, str3);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (str2 == null) {
                                    sb.append(" rolloutId");
                                }
                                if (str3 == null) {
                                    sb.append(" variantId");
                                }
                                throw new IllegalStateException(no.a.n("Missing required properties:", sb));
                            }
                        case true:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            d1Var.c = nextString2;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return d1Var.a();
            case 1:
                jsonReader.beginObject();
                List list = null;
                byte b = 0;
                int i2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1266514778:
                            if (nextName3.equals("frames")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3373707:
                            if (nextName3.equals("name")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 2125650548:
                            if (nextName3.equals("importance")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            list = c.d(jsonReader, new a(i));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                            continue;
                        case true:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case true:
                            i2 = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new v0(i2, str, list);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" name");
                }
                if ((b & 1) == 0) {
                    sb2.append(" importance");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                throw new IllegalStateException(no.a.n("Missing required properties:", sb2));
            case 2:
                jsonReader.beginObject();
                String str4 = null;
                String str5 = null;
                byte b2 = 0;
                long j = 0;
                long j2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case 3373707:
                            if (nextName4.equals("name")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3530753:
                            if (nextName4.equals("size")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3601339:
                            if (nextName4.equals("uuid")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1153765347:
                            if (nextName4.equals("baseAddress")) {
                                z3 = 3;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        case false:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 == null) {
                                throw new NullPointerException("Null name");
                            }
                            str4 = nextString3;
                            break;
                        case true:
                            b2 = (byte) (b2 | 2);
                            j2 = jsonReader.nextLong();
                            break;
                        case true:
                            str5 = new String(Base64.decode(jsonReader.nextString(), 2), n2.a);
                            break;
                        case true:
                            b2 = (byte) (b2 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 3 && str4 != null) {
                    return new s0(j, j2, str4, str5);
                }
                StringBuilder sb3 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb3.append(" baseAddress");
                }
                if ((b2 & 2) == 0) {
                    sb3.append(" size");
                }
                if (str4 == null) {
                    sb3.append(" name");
                }
                throw new IllegalStateException(no.a.n("Missing required properties:", sb3));
            default:
                return c.a(jsonReader);
        }
    }
}
