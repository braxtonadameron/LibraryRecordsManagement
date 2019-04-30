import { TestBed } from '@angular/core/testing';

import { LibraryCardService } from './library-card.service';

describe('LibraryCardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LibraryCardService = TestBed.get(LibraryCardService);
    expect(service).toBeTruthy();
  });
});
