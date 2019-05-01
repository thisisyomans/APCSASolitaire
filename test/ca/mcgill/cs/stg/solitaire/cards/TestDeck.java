/*******************************************************************************
 * Solitaire
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package ca.mcgill.cs.stg.solitaire.cards;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestDeck
{
	@Test
	public void testdraw()
	{
		Deck lDeck = new Deck();
		lDeck.shuffle();
		Set<Card> lCards = new HashSet<Card>();
		for( int i = 0; i < 52; i++ )
		{
			Card lCard = lDeck.draw();
			assertFalse( lCards.contains(lCard));
			lCards.add( lCard );
		}
		assertTrue( lDeck.isEmpty() );
	}
}
