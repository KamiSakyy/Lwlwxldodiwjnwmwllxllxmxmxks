package k81;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i0 implements KSerializer {
    public static final i0 a = new i0();
    public static final i1 b = new i1("kotlin.time.Instant", i81.e.m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i;
        kotlin.time.f i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        char charAt;
        char charAt2;
        kotlin.time.d dVar = kotlin.time.d.t;
        String n = decoder.n();
        k71.k.g(n, "input");
        if (n.length() == 0) {
            i2 = new kotlin.time.f("An empty string is not a valid Instant", n);
        } else {
            char charAt3 = n.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                charAt3 = ' ';
            }
            int i7 = 0;
            int i8 = i;
            while (i8 < n.length() && '0' <= (charAt2 = n.charAt(i8)) && charAt2 < ':') {
                i7 = (i7 * 10) + (n.charAt(i8) - '0');
                i8++;
            }
            int i9 = i8 - i;
            if (i9 > 10) {
                i2 = kotlin.time.e.j(n, "Expected at most 10 digits for the year number, got " + i9 + " digits");
            } else if (i9 == 10 && k71.k.h(n.charAt(i), 50) >= 0) {
                i2 = kotlin.time.e.j(n, "Expected at most 9 digits for the year number or year 1000000000, got " + i9 + " digits");
            } else if (i9 < 4) {
                i2 = kotlin.time.e.j(n, "The year number must be padded to 4 digits, got " + i9 + " digits");
            } else if (charAt3 == '+' && i9 == 4) {
                i2 = kotlin.time.e.j(n, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i9 == 4) {
                if (charAt3 == '-') {
                    i7 = -i7;
                }
                int i10 = i8 + 16;
                if (n.length() >= i10) {
                    kotlin.time.f i11 = kotlin.time.e.i(n, "'-'", i8, new jy.b(14));
                    if (i11 == null && (i11 = kotlin.time.e.i(n, "'-'", i8 + 3, new jy.b(15))) == null) {
                        i2 = kotlin.time.e.i(n, "'T' or 't'", i8 + 6, new jy.b(16));
                        if (i2 == null && (i2 = kotlin.time.e.i(n, "':'", i8 + 9, new jy.b(17))) == null && (i2 = kotlin.time.e.i(n, "':'", i8 + 12, new jy.b(18))) == null) {
                            for (int i12 = 0; i12 < 10; i12++) {
                                i11 = kotlin.time.e.i(n, "an ASCII digit", kotlin.time.e.b[i12] + i8, new jy.b(19));
                                if (i11 == null) {
                                }
                            }
                            int k = kotlin.time.e.k(n, i8 + 1);
                            int k2 = kotlin.time.e.k(n, i8 + 4);
                            int k3 = kotlin.time.e.k(n, i8 + 7);
                            int k4 = kotlin.time.e.k(n, i8 + 10);
                            int k5 = kotlin.time.e.k(n, i8 + 13);
                            int i13 = i8 + 15;
                            if (n.charAt(i13) == '.') {
                                i13 = i10;
                                int i14 = 0;
                                while (i13 < n.length() && '0' <= (charAt = n.charAt(i13)) && charAt < ':') {
                                    i14 = (i14 * 10) + (n.charAt(i13) - '0');
                                    i13++;
                                }
                                int i15 = i13 - i10;
                                if (1 > i15 || i15 >= 10) {
                                    i2 = kotlin.time.e.j(n, "1..9 digits are supported for the fraction of the second, got " + i15 + " digits");
                                } else {
                                    i3 = i14 * kotlin.time.e.a[9 - i15];
                                }
                            } else {
                                i3 = 0;
                            }
                            if (i13 >= n.length()) {
                                i2 = kotlin.time.e.j(n, "The UTC offset at the end of the string is missing");
                            } else {
                                char charAt4 = n.charAt(i13);
                                if (charAt4 == '+' || charAt4 == '-') {
                                    int length = n.length() - i13;
                                    if (length > 9) {
                                        i2 = kotlin.time.e.j(n, "The UTC offset string \"" + kotlin.time.e.p(n.subSequence(i13, n.length()).toString(), 16) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        i2 = kotlin.time.e.j(n, "Invalid UTC offset string \"" + n.subSequence(i13, n.length()).toString() + '\"');
                                    } else {
                                        int i16 = 0;
                                        for (int i17 = 2; i16 < i17; i17 = 2) {
                                            int i18 = i13 + kotlin.time.e.c[i16];
                                            if (i18 >= n.length()) {
                                                break;
                                            }
                                            if (n.charAt(i18) != ':') {
                                                StringBuilder o = x.i.o("Expected ':' at index ", i18, ", got '");
                                                o.append(n.charAt(i18));
                                                o.append('\'');
                                                i2 = kotlin.time.e.j(n, o.toString());
                                                break;
                                            }
                                            i16++;
                                        }
                                        int i19 = 0;
                                        while (i19 < 6 && (i5 = kotlin.time.e.d[i19] + i13) < n.length()) {
                                            char charAt5 = n.charAt(i5);
                                            int i20 = i19;
                                            if ('0' > charAt5 || charAt5 >= ':') {
                                                StringBuilder o2 = x.i.o("Expected an ASCII digit at index ", i5, ", got '");
                                                o2.append(n.charAt(i5));
                                                o2.append('\'');
                                                i2 = kotlin.time.e.j(n, o2.toString());
                                                break;
                                            }
                                            i19 = i20 + 1;
                                        }
                                        int k6 = kotlin.time.e.k(n, i13 + 1);
                                        int k7 = length > 3 ? kotlin.time.e.k(n, i13 + 4) : 0;
                                        int k8 = length > 6 ? kotlin.time.e.k(n, i13 + 7) : 0;
                                        if (k7 > 59) {
                                            i2 = kotlin.time.e.j(n, "Expected offset-minute-of-hour in 0..59, got " + k7);
                                        } else if (k8 > 59) {
                                            i2 = kotlin.time.e.j(n, "Expected offset-second-of-minute in 0..59, got " + k8);
                                        } else if (k6 <= 17 || (k6 == 18 && k7 == 0 && k8 == 0)) {
                                            i4 = ((k7 * 60) + (k6 * 3600) + k8) * (charAt4 == '-' ? -1 : 1);
                                            if (1 <= k || k >= 13) {
                                                i2 = kotlin.time.e.j(n, "Expected a month number in 1..12, got " + k);
                                            } else {
                                                if (1 <= k2) {
                                                    int i21 = i7 & 3;
                                                    if (k2 <= (k != 2 ? (k == 4 || k == 6 || k == 9 || k == 11) ? 30 : 31 : i21 == 0 && (i7 % 100 != 0 || i7 % 400 == 0) ? 29 : 28)) {
                                                        if (k3 > 23) {
                                                            i2 = kotlin.time.e.j(n, "Expected hour in 0..23, got " + k3);
                                                        } else if (k4 > 59) {
                                                            i2 = kotlin.time.e.j(n, "Expected minute-of-hour in 0..59, got " + k4);
                                                        } else if (k5 > 59) {
                                                            i2 = kotlin.time.e.j(n, "Expected second-of-minute in 0..59, got " + k5);
                                                        } else {
                                                            long j2 = i7;
                                                            long j3 = 365 * j2;
                                                            if (j2 >= 0) {
                                                                i6 = i4;
                                                                j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j3;
                                                            } else {
                                                                i6 = i4;
                                                                j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                            }
                                                            long j4 = j + (((k * 367) - 362) / 12) + (k2 - 1);
                                                            if (k > 2) {
                                                                j4 = (i21 != 0 || (i7 % 100 == 0 && i7 % 400 != 0)) ? j4 - 2 : (-1) + j4;
                                                            }
                                                            i2 = new kotlin.time.g(i3, (((j4 - 719528) * 86400) + (((k4 * 60) + (k3 * 3600)) + k5)) - i6);
                                                        }
                                                    }
                                                }
                                                StringBuilder m = x.i.m(k, i7, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                m.append(k2);
                                                i2 = kotlin.time.e.j(n, m.toString());
                                            }
                                        } else {
                                            i2 = kotlin.time.e.j(n, "Expected an offset in -18:00..+18:00, got " + n.subSequence(i13, n.length()).toString());
                                        }
                                    }
                                } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                    int i22 = i13 + 1;
                                    if (n.length() == i22) {
                                        i4 = 0;
                                        if (1 <= k) {
                                        }
                                        i2 = kotlin.time.e.j(n, "Expected a month number in 1..12, got " + k);
                                    } else {
                                        i2 = kotlin.time.e.j(n, "Extra text after the instant at position " + i22);
                                    }
                                } else {
                                    i2 = kotlin.time.e.j(n, "Expected the UTC offset at position " + i13 + ", got '" + charAt4 + '\'');
                                }
                            }
                        }
                    }
                    i2 = i11;
                    break;
                } else {
                    i2 = kotlin.time.e.j(n, "The input string is too short");
                }
            } else {
                i2 = kotlin.time.e.j(n, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return i2.toInstant();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.time.d dVar = (kotlin.time.d) obj;
        k71.k.g(dVar, "value");
        encoder.p(dVar.toString());
    }
}
