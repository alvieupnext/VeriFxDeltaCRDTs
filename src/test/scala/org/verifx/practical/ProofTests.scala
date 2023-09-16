package org.verifx.practical

import org.verifx.practical.Prover
import org.scalatest.FlatSpec

class ProofTests extends FlatSpec with Prover {
  "deltaGCounter" should "be a CRDT" in {
    val proof = ("deltaGCounter", "is_a_CvRDT")
    prove(proof)
  }

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
