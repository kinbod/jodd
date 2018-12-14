// Copyright (c) 2003-present, Jodd Team (http://jodd.org)
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice,
// this list of conditions and the following disclaimer.
//
// 2. Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer in the
// documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package jodd.mutable;

/**
 * A mutable <code>int</code> wrapper.
 */
public final class MutableInteger extends Number implements Comparable<MutableInteger>, Cloneable {

	public static MutableInteger of(final int value) {
		return new MutableInteger(value);
	}

	public MutableInteger() {
	}

	public MutableInteger(final int value) {
		this.value = value;
	}

	public MutableInteger(final String value) {
		this.value = Integer.parseInt(value);
	}

	public MutableInteger(final Number number) {
		this.value = number.intValue();
	}

	// ---------------------------------------------------------------- value

	/**
	 * The mutable value.
	 */
	public int value;

	/**
	 * Returns mutable value.
	 */
	public int get() {
		return value;
	}

	/**
	 * Sets mutable value.
	 */
	public void set(final int value) {
		this.value = value;
	}

	/**
	 * Sets mutable value from a Number.
	 */
	public void set(final Number value) {
		this.value = value.intValue();
	}

	// ---------------------------------------------------------------- object

	/**
	 * Stringify the value.
	 */
	@Override
	public String toString() {
		return Integer.toString(value);
	}

	/**
	 * Returns a hashcode for this value.
	 */
	@Override
	public int hashCode() {
		return value;
	}

	/**
	 * Compares this object to the specified object.
	 *
	 * @param obj the object to compare with.
	 * @return <code>true</code> if the objects are the same;
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj != null) {
			if ( ((Integer)this.value).getClass() == obj.getClass() ) {
				return value == ((Integer) obj).intValue();
			}
			if (this.getClass() == obj.getClass()) {
				return value == ((MutableInteger) obj).value;
			}
		}
		return false;
	}

	// ---------------------------------------------------------------- number

	/**
	 * Returns the value as a int.
	 */
	@Override
	public int intValue() {
		return value;
	}

	/**
	 * Returns the value as a long.
	 */
	@Override
	public long longValue() {
		return value;
	}

	/**
	 * Returns the value as a float.
	 */
	@Override
	public float floatValue() {
		return value;
	}

	/**
	 * Returns the value as a double.
	 */
	@Override
	public double doubleValue() {
		return value;
	}

	// ---------------------------------------------------------------- compare

	/**
	 * Compares value of two same instances.
	 */
	@Override
	public int compareTo(final MutableInteger other) {
		return value < other.value ? -1 : (value == other.value ? 0 : 1);
	}

	// ---------------------------------------------------------------- clone

	/**
	 * Clones object.
	 */
	@Override
	public MutableInteger clone() {
		return new MutableInteger(value);
	}

}