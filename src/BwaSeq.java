/**
 * Copyright 2016 José Manuel Abuín Mosquera <josemanuel.abuin@usc.es>
 * 
 * This file is part of SparkBWA.
 *
 * SparkBWA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SparkBWA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with SparkBWA. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This class is used in case of need to use BWA from Java in a sequential way. Use: java -jar BwaSeq.jar bwa mem ...
 * @author José M. Abuín
 *
 */
public class BwaSeq {

	
	
	public static void main(String[] args) {
		
		BwaJni.Bwa_Jni(args);
		
	}
	

}
