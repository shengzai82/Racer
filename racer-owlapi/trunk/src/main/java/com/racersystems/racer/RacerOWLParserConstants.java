/* Generated By:JavaCC: Do not edit this line. RacerOWLParserConstants.java */
package com.racersystems.racer;

public interface RacerOWLParserConstants {

  int EOF = 0;
  int NEWLINER = 5;
  int INT = 6;
  int TOP = 7;
  int BOTTOM = 8;
  int DBOTTOM = 9;
  int OBOTTOM = 10;
  int DTOP = 11;
  int OTOP = 12;
  int ABORTED = 13;
  int ATLEAST = 14;
  int DATLEAST = 15;
  int ATMOST = 16;
  int DATMOST = 17;
  int EXACTLY = 18;
  int DEXACTLY = 19;
  int AND = 20;
  int OR = 21;
  int NOT = 22;
  int ALL = 23;
  int DALL = 24;
  int SOME = 25;
  int DSOME = 26;
  int INV = 27;
  int DBASETYPE = 28;
  int DLITERAL = 29;
  int DCOMPLEMENT = 30;
  int DDATARANGE = 31;
  int DPOSSIBLEVALUES = 32;
  int booleanValue = 33;
  int realValue = 34;
  int stringValue = 35;
  int integerValue = 36;
  int noValue = 37;
  int ANSWER = 38;
  int INCONSISTENTABOX = 39;
  int VOID = 40;
  int OK = 41;
  int ERROR = 42;
  int ROLEFILLERS = 43;
  int ASSERTIONS = 44;
  int TOLDATTRIBUTEFILLERS = 45;
  int TOLDDATATYPEFILLERS = 46;
  int ANNOTATIONDATATYPEPROPERTYFILLERS = 47;
  int ANNOTATIONPROPERTYFILLERS = 48;
  int DIRECTTYPES = 49;
  int TOBECOMPUTED = 50;
  int NEWLINE = 51;
  int OPENPAR = 52;
  int CLOSEPAR = 53;
  int NIL = 54;
  int TRUE = 55;
  int NCNAME1 = 56;
  int NCCHAR_FULL = 57;
  int NCCHAR1 = 58;
  int QUOTED_STRING = 59;
  int STRING_LITERAL = 60;
  int STRING_LITERAL2 = 61;
  int VAR = 62;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"|\"",
    "\"\\\\\\\\N\"",
    "<INT>",
    "<TOP>",
    "<BOTTOM>",
    "<DBOTTOM>",
    "<OBOTTOM>",
    "<DTOP>",
    "<OTOP>",
    "\":aborted\"",
    "\"at-least\"",
    "\"d-at-least\"",
    "\"at-most\"",
    "\"d-at-most\"",
    "\"exactly\"",
    "\"dexactly\"",
    "\"and\"",
    "\"or\"",
    "\"not\"",
    "\"all\"",
    "\"d-all\"",
    "\"some\"",
    "\"dsome\"",
    "\"inv\"",
    "\"d-base-type\"",
    "\"d-literal\"",
    "\"d-complement\"",
    "\"d-data-range\"",
    "\"d-possible-values\"",
    "\"RACER-INTERNAL%HAS-BOOLEAN-VALUE\"",
    "\"RACER-INTERNAL%HAS-REAL-VALUE\"",
    "\"RACER-INTERNAL%HAS-STRING-VALUE\"",
    "\"RACER-INTERNAL%HAS-INTEGER-VALUE\"",
    "\"NO\"",
    "\":answer\"",
    "\":abox-inconsistent\"",
    "\":void\"",
    "\":ok\"",
    "\":error\"",
    "\":role-fillers\"",
    "\":assertions\"",
    "\":told-attribute-fillers\"",
    "\":told-datatype-fillers\"",
    "\":annotation-datatype-property-fillers\"",
    "\":annotation-property-fillers\"",
    "\":direct-types\"",
    "\":to-be-computed\"",
    "\"\\n\"",
    "\"(\"",
    "\")\"",
    "\"NIL\"",
    "\"t\"",
    "<NCNAME1>",
    "<NCCHAR_FULL>",
    "<NCCHAR1>",
    "<QUOTED_STRING>",
    "<STRING_LITERAL>",
    "<STRING_LITERAL2>",
    "<VAR>",
    "\"\\\"\"",
  };

}
