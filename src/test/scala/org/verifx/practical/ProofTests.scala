package org.verifx.practical

import org.verifx.practical.Prover
import org.scalatest.FlatSpec

class ProofTests extends FlatSpec with Prover {
  "deltaGCounter" should "be a CRDT" in {
    val proof = ("deltaGCounter", "is_a_CvRDT")
    prove(proof)
  }

  "deltaGSet" should "be a CRDT" in {
    val proof = ("deltaGSet", "is_a_CvRDT")
    prove(proof)
  }

  "deltaTwoPSet" should "be a CRDT" in {
    val proof = ("deltaTwoPSet", "is_a_CvRDT")
    prove(proof)
  }

    "DotContext" should "be a CRDT" in {
      val proof = ("DotContext", "is_a_CvRDT")
      prove(proof)
    }

      "deltaGMap" should "be a CRDT" in {
        val proof = ("deltaTwoPSet", "is_a_CvRDT")
        prove(proof)
      }

//    "deltaORSeq" should "be a CRDT" in {
//      val proof = ("deltaORSeq", "is_a_CvRDT")
//      prove(proof)
//    }

    "deltaPNCounter" should "be a CRDT" in {
      val proof = ("deltaPNCounter", "is_a_CvRDT")
      prove(proof)
    }

  "deltaLexCounter" should "be a CRDT" in {
    val proof = ("deltaLexCounter", "is_a_CvRDT")
    prove(proof)
  }


//  "RWLWWSet" should "be a CRDT" in {
//    val proof = ("RWLWWSet", "is_a_CvRDT")
//    val res = rejectForModel(proof)
//    println(res.toString())
////    prove(proof)
//  }

//  "deltaBCounter" should "be a CRDT" in {
//    val proof = ("deltaBCounter", "is_a_CvRDT")
////    val res = rejectForModel(proof)
////    println(res.toString())
//    prove(proof)
//  }

//  "PNCounter" should "be a CRDT" in {
//    val proof = ("PNCounter", "is_a_CvRDT")
//    prove(proof)
//  }
//
//  "GSet" should "be a CRDT" in {
//    val proof = ("GSet", "is_a_CvRDT")
//    prove(proof)
//  }
//
//  "TwoPSet" should "be a CRDT" in {
//    val proof = ("TwoPSet", "is_a_CvRDT")
//    prove(proof)
//  }
//
//  it should "compare correctly" in {
//    val proof = ("TwoPSet", "compareCorrect")
//    prove(proof)
//
//    // Oops, proof is rejected
//    // remove the call to `prove` above and uncomment the below to see the counterexample
//    /*
//    val res = rejectForModel(proof)
//    println(res.toString())
//    */
//  }
//
//  "ORSet" should "be a CRDT" in {
//    val proof = ("ORSet", "is_a_CmRDT")
//    prove(proof)
//  }
}
